package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVaping: ImageVector? = null

val Icons.Tr.NoVaping: ImageVector
    get() = _NoVaping ?: UXIcon(name = "NoVaping") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 23f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.07f, 0f, 2.06f, 0.48f, 2.73f, 1.31f)
                curveToRelative(0.17f, 0.22f, 0.49f, 0.25f, 0.7f, 0.08f)
                curveToRelative(0.22f, -0.17f, 0.25f, -0.49f, 0.08f, -0.7f)
                curveToRelative(-0.86f, -1.07f, -2.14f, -1.69f, -3.51f, -1.69f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(3.5f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(0f, -1.34f, 0.48f, -2.56f, 1.28f, -3.52f)
                lineToRelative(7.74f, 7.74f)
                curveToRelative(-0.95f, 0.8f, -2.18f, 1.28f, -3.52f, 1.28f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                close()
                moveTo(21.72f, 21.02f)
                lineTo(13.98f, 13.28f)
                curveToRelative(0.95f, -0.8f, 2.18f, -1.28f, 3.52f, -1.28f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                curveToRelative(0f, 1.34f, -0.48f, 2.56f, -1.28f, 3.52f)
                close()
            }
        }.also { _NoVaping = it}
