package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCopy: ImageVector? = null

val Icons.Bs.BookCopy: ImageVector
    get() = _BookCopy ?: UXIcon(name = "BookCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(12f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                verticalLineToRelative(-7.14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(4f, 21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7.14f)
                curveToRelative(0.32f, -0.08f, 0.65f, -0.14f, 1f, -0.14f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.19f, 1.14f, 0.71f, 2.17f, 1.45f, 3f)
                horizontalLineToRelative(-3.54f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _BookCopy = it}
