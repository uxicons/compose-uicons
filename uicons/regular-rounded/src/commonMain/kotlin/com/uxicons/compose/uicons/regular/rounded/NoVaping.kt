package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVaping: ImageVector? = null

val Icons.Rr.NoVaping: ImageVector
    get() = _NoVaping ?: UXIcon(name = "NoVaping") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 22f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(9f)
                curveToRelative(0.73f, 0f, 1.44f, 0.27f, 1.98f, 0.75f)
                curveToRelative(0.41f, 0.37f, 1.05f, 0.33f, 1.41f, -0.09f)
                curveToRelative(0.37f, -0.41f, 0.33f, -1.05f, -0.09f, -1.41f)
                curveToRelative(-0.91f, -0.81f, -2.09f, -1.25f, -3.31f, -1.25f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 22f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -0.88f, 0.26f, -1.69f, 0.7f, -2.39f)
                lineToRelative(6.19f, 6.19f)
                curveToRelative(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f)
                close()
                moveTo(21.3f, 19.89f)
                lineTo(15.11f, 13.7f)
                curveToRelative(0.69f, -0.44f, 1.51f, -0.7f, 2.39f, -0.7f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f)
                close()
            }
        }.also { _NoVaping = it}
