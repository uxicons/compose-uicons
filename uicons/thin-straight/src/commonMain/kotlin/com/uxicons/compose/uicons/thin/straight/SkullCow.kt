package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCow: ImageVector? = null

val Icons.Ts.SkullCow: ImageVector
    get() = _SkullCow ?: UXIcon(name = "SkullCow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 13f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(9f, 13f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(9f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(5f, 4f)
                curveTo(2.79f, 4f, 1f, 2.21f, 1f, 0f)
                lineTo(0f, 0f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(0.78f)
                lineToRelative(-2.58f, 6.84f)
                curveToRelative(-0.58f, 1.66f, 0.17f, 3.5f, 1.8f, 4.31f)
                lineToRelative(2.08f, 0.73f)
                lineToRelative(1.53f, 7.12f)
                horizontalLineToRelative(6.81f)
                lineToRelative(1.52f, -7.12f)
                lineToRelative(2.13f, -0.75f)
                curveToRelative(1.57f, -0.79f, 2.32f, -2.63f, 1.73f, -4.3f)
                lineToRelative(-2.58f, -6.83f)
                horizontalLineToRelative(0.78f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
                moveTo(19.86f, 12.17f)
                curveToRelative(0.41f, 1.19f, -0.12f, 2.5f, -1.18f, 3.04f)
                lineToRelative(-2.6f, 0.91f)
                lineToRelative(-1.48f, 6.88f)
                horizontalLineToRelative(-5.19f)
                lineToRelative(-1.47f, -6.88f)
                lineToRelative(-2.55f, -0.89f)
                curveToRelative(-1.12f, -0.56f, -1.66f, -1.88f, -1.25f, -3.05f)
                lineToRelative(2.71f, -7.18f)
                horizontalLineToRelative(10.31f)
                lineToRelative(2.71f, 7.17f)
                close()
            }
        }.also { _SkullCow = it}
