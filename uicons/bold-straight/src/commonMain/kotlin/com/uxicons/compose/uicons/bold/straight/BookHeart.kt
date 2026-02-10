package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookHeart: ImageVector? = null

val Icons.Bs.BookHeart: ImageVector
    get() = _BookHeart ?: UXIcon(name = "BookHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(5f, 0f)
                curveTo(2.79f, 0f, 1f, 1.79f, 1f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(18f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(13f)
                lineTo(5f, 16f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                lineTo(4f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 21f)
                close()
                moveTo(7.5f, 8.0f)
                curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
                reflectiveCurveToRelative(2.25f, 1.12f, 2.25f, 2.5f)
                curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
                reflectiveCurveToRelative(2.25f, 1.12f, 2.25f, 2.5f)
                curveToRelative(0f, 2.61f, -4.5f, 5.75f, -4.5f, 5.75f)
                curveToRelative(0f, 0f, -4.5f, -3.14f, -4.5f, -5.75f)
                close()
            }
        }.also { _BookHeart = it}
