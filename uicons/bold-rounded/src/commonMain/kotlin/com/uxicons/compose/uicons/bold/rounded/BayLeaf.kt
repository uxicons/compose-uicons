package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BayLeaf: ImageVector? = null

val Icons.Br.BayLeaf: ImageVector
    get() = _BayLeaf ?: UXIcon(name = "BayLeaf") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.73f, 1.27f)
            curveToRelative(-0.84f, -0.84f, -1.96f, -1.27f, -3.14f, -1.27f)
            curveToRelative(-3.92f, 0.06f, -9.36f, 0.91f, -13.02f, 4.57f)
            curveToRelative(-4.83f, 4.83f, -4.69f, 12.79f, -4.52f, 15.25f)
            lineToRelative(-1.62f, 1.62f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0f)
            lineToRelative(1.62f, -1.62f)
            curveToRelative(0.44f, 0.03f, 1.05f, 0.06f, 1.79f, 0.06f)
            curveToRelative(3.42f, 0f, 9.5f, -0.62f, 13.46f, -4.58f)
            curveToRelative(3.67f, -3.66f, 4.51f, -9.1f, 4.57f, -13.02f)
            curveToRelative(0.02f, -1.19f, -0.43f, -2.3f, -1.27f, -3.14f)
            close()
            moveTo(18.39f, 14f)
            horizontalLineToRelative(-6.27f)
            lineToRelative(2f, -2f)
            horizontalLineToRelative(5.38f)
            curveToRelative(-0.31f, 0.69f, -0.67f, 1.37f, -1.11f, 2f)
            close()
            moveTo(10f, 5.61f)
            curveToRelative(0.63f, -0.44f, 1.3f, -0.81f, 2f, -1.11f)
            verticalLineToRelative(5.38f)
            lineToRelative(-2f, 2f)
            close()
            moveTo(15f, 3.53f)
            curveToRelative(1.4f, -0.31f, 2.75f, -0.45f, 3.85f, -0.5f)
            lineToRelative(-3.85f, 3.85f)
            close()
            moveTo(17.12f, 9f)
            lineTo(20.97f, 5.15f)
            curveToRelative(-0.05f, 1.11f, -0.19f, 2.45f, -0.5f, 3.85f)
            horizontalLineToRelative(-3.35f)
            close()
            moveTo(7f, 8.98f)
            verticalLineToRelative(5.9f)
            lineToRelative(-1.97f, 1.97f)
            curveToRelative(0.11f, -2.27f, 0.55f, -5.31f, 1.97f, -7.87f)
            close()
            moveTo(9.12f, 17f)
            horizontalLineToRelative(5.9f)
            curveToRelative(-2.56f, 1.42f, -5.59f, 1.86f, -7.87f, 1.97f)
            close()
        }
    }.also { _BayLeaf = it }
