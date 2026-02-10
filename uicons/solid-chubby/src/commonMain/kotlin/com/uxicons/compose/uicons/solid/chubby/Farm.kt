package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Farm: ImageVector? = null

val Icons.Sc.Farm: ImageVector
    get() = _Farm ?: UXIcon(name = "Farm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 19.5f)
                curveToRelative(0f, 0.76f, 0.07f, 1.5f, 0.17f, 2.14f)
                lineToRelative(2.27f, -1.9f)
                lineToRelative(-2.34f, -1.95f)
                curveToRelative(-0.06f, 0.49f, -0.1f, 1.07f, -0.1f, 1.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.55f, 19.74f)
                lineToRelative(2.28f, 1.9f)
                curveToRelative(0.09f, -0.65f, 0.17f, -1.39f, 0.17f, -2.14f)
                curveToRelative(0f, -0.65f, -0.04f, -1.23f, -0.1f, -1.73f)
                lineToRelative(-2.35f, 1.97f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.09f, 16.02f)
                lineToRelative(2.9f, 2.42f)
                lineToRelative(2.9f, -2.43f)
                curveToRelative(-0.74f, -0.25f, -1.78f, -0.51f, -2.89f, -0.51f)
                curveToRelative(-1.12f, 0f, -2.17f, 0.26f, -2.91f, 0.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 21.04f)
                lineToRelative(-2.5f, 1.96f)
                horizontalLineToRelative(5f)
                reflectiveCurveToRelative(-2.5f, -1.96f, -2.5f, -1.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.45f, 9.18f)
                curveToRelative(-0.03f, -0.08f, -0.06f, -0.15f, -0.1f, -0.22f)
                lineToRelative(-3.5f, -5.5f)
                curveToRelative(-0.12f, -0.18f, -0.29f, -0.33f, -0.5f, -0.4f)
                curveToRelative(-5.6f, -2.06f, -6.16f, -2.06f, -6.35f, -2.06f)
                reflectiveCurveToRelative(-0.75f, 0f, -6.35f, 2.06f)
                curveToRelative(-0.2f, 0.08f, -0.38f, 0.22f, -0.5f, 0.4f)
                lineToRelative(-3.5f, 5.5f)
                curveToRelative(-0.04f, 0.07f, -0.08f, 0.14f, -0.1f, 0.22f)
                curveToRelative(-0.02f, 0.07f, -0.55f, 1.69f, -0.55f, 4.82f)
                curveToRelative(0f, 4.12f, 1.01f, 7.19f, 1.05f, 7.32f)
                curveToRelative(0.1f, 0.29f, 0.33f, 0.53f, 0.62f, 0.63f)
                curveToRelative(0.08f, 0.03f, 1.25f, 0.43f, 3.64f, 0.73f)
                curveToRelative(-0.16f, -0.87f, -0.31f, -2.0f, -0.31f, -3.17f)
                curveToRelative(0f, -2.53f, 0.55f, -4.17f, 0.57f, -4.24f)
                curveToRelative(0.08f, -0.24f, 0.26f, -0.44f, 0.48f, -0.56f)
                curveToRelative(0.09f, -0.05f, 2.3f, -1.2f, 4.95f, -1.2f)
                reflectiveCurveToRelative(4.86f, 1.15f, 4.95f, 1.2f)
                curveToRelative(0.23f, 0.12f, 0.4f, 0.32f, 0.48f, 0.56f)
                curveToRelative(0.02f, 0.07f, 0.57f, 1.69f, 0.57f, 4.24f)
                curveToRelative(0f, 1.17f, -0.15f, 2.3f, -0.31f, 3.17f)
                curveToRelative(2.39f, -0.3f, 3.56f, -0.7f, 3.64f, -0.73f)
                curveToRelative(0.29f, -0.1f, 0.52f, -0.33f, 0.62f, -0.63f)
                curveToRelative(0.04f, -0.13f, 1.05f, -3.2f, 1.05f, -7.32f)
                curveToRelative(0f, -3.13f, -0.53f, -4.75f, -0.55f, -4.82f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _Farm = it}
