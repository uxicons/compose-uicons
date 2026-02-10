package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RestroomSimple: ImageVector? = null

val Icons.Rs.RestroomSimple: ImageVector
    get() = _RestroomSimple ?: UXIcon(name = "RestroomSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.99f)
                lineToRelative(1.6f, -12.26f)
                curveToRelative(0.2f, -1.56f, 1.6f, -2.75f, 3.25f, -2.75f)
                horizontalLineToRelative(0.27f)
                curveToRelative(1.65f, 0f, 3.04f, 1.18f, 3.25f, 2.74f)
                lineToRelative(1.6f, 12.26f)
                horizontalLineToRelative(-1.99f)
                close()
                moveTo(16.29f, 19f)
                horizontalLineToRelative(5.41f)
                lineToRelative(-1.31f, -9.99f)
                curveToRelative(-0.08f, -0.58f, -0.61f, -1.0f, -1.26f, -1.0f)
                horizontalLineToRelative(-0.27f)
                curveToRelative(-0.66f, 0f, -1.19f, 0.42f, -1.26f, 1.01f)
                lineToRelative(-1.31f, 9.99f)
                close()
                moveTo(4f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.38f, 0f, 4f, 0f)
                reflectiveCurveTo(1.5f, 1.12f, 1.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8f, 9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                lineTo(1f, 24f)
                verticalLineToRelative(-6f)
                lineTo(0f, 18f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(2f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(24f)
                close()
            }
        }.also { _RestroomSimple = it}
