package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mp3Player: ImageVector? = null

val Icons.Sc.Mp3Player: ImageVector
    get() = _Mp3Player ?: UXIcon(name = "Mp3Player") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11f)
                curveToRelative(-2.3f, 0f, -3f, 0.7f, -3f, 3f)
                reflectiveCurveToRelative(0.7f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -0.7f, 3f, -3f)
                reflectiveCurveToRelative(-0.7f, -3f, -3f, -3f)
                close()
                moveTo(12f, 15.5f)
                curveToRelative(-1.07f, 0f, -1.5f, -0.43f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.43f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.43f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.43f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.09f, 2.51f)
                curveToRelative(-0.08f, -0.4f, -0.4f, -0.71f, -0.8f, -0.78f)
                curveToRelative(-0.16f, -0.03f, -4.04f, -0.73f, -7.29f, -0.73f)
                reflectiveCurveToRelative(-7.13f, 0.7f, -7.29f, 0.73f)
                curveToRelative(-0.4f, 0.07f, -0.72f, 0.38f, -0.8f, 0.78f)
                curveToRelative(-0.04f, 0.18f, -0.91f, 4.44f, -0.91f, 9.49f)
                reflectiveCurveToRelative(0.87f, 9.31f, 0.91f, 9.49f)
                curveToRelative(0.08f, 0.4f, 0.4f, 0.71f, 0.8f, 0.78f)
                curveToRelative(0.16f, 0.03f, 4.04f, 0.73f, 7.29f, 0.73f)
                reflectiveCurveToRelative(7.13f, -0.7f, 7.29f, -0.73f)
                curveToRelative(0.4f, -0.07f, 0.72f, -0.38f, 0.8f, -0.78f)
                curveToRelative(0.04f, -0.18f, 0.91f, -4.44f, 0.91f, -9.49f)
                reflectiveCurveToRelative(-0.87f, -9.31f, -0.91f, -9.49f)
                close()
                moveTo(7.89f, 5.27f)
                curveToRelative(1.56f, -0.18f, 2.95f, -0.27f, 4.11f, -0.27f)
                reflectiveCurveToRelative(2.55f, 0.09f, 4.11f, 0.27f)
                curveToRelative(0.55f, 0.06f, 0.94f, 0.56f, 0.88f, 1.11f)
                curveToRelative(-0.06f, 0.55f, -0.57f, 0.94f, -1.11f, 0.88f)
                curveToRelative(-1.49f, -0.17f, -2.79f, -0.26f, -3.89f, -0.26f)
                reflectiveCurveToRelative(-2.4f, 0.09f, -3.89f, 0.26f)
                curveToRelative(-0.55f, 0.07f, -1.04f, -0.33f, -1.11f, -0.88f)
                reflectiveCurveToRelative(0.33f, -1.04f, 0.88f, -1.11f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.41f, 0f, -5f, -1.59f, -5f, -5f)
                reflectiveCurveToRelative(1.59f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.59f, 5f, 5f)
                reflectiveCurveToRelative(-1.59f, 5f, -5f, 5f)
                close()
            }
        }.also { _Mp3Player = it}
