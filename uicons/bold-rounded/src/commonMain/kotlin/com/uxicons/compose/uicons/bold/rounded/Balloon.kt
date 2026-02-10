package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Br.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 9.46f)
            curveTo(22f, 4.26f, 17.51f, 0.03f, 12f, 0.03f)
            reflectiveCurveTo(2f, 4.26f, 2f, 9.46f)
            curveToRelative(0f, 4.99f, 3.04f, 10.49f, 7.43f, 12.08f)
            curveToRelative(-0.13f, 0.23f, -0.25f, 0.48f, -0.35f, 0.73f)
            curveToRelative(-0.33f, 0.83f, 0.3f, 1.73f, 1.19f, 1.73f)
            horizontalLineToRelative(3.45f)
            curveToRelative(0.89f, 0f, 1.51f, -0.9f, 1.19f, -1.73f)
            curveToRelative(-0.1f, -0.25f, -0.21f, -0.49f, -0.35f, -0.73f)
            curveToRelative(4.39f, -1.59f, 7.43f, -7.09f, 7.43f, -12.08f)
            close()
            moveTo(12f, 19f)
            curveToRelative(-3.88f, 0f, -7f, -5.22f, -7f, -9.54f)
            curveToRelative(0f, -3.55f, 3.14f, -6.43f, 7f, -6.43f)
            reflectiveCurveToRelative(7f, 2.89f, 7f, 6.43f)
            curveToRelative(0f, 4.32f, -3.12f, 9.54f, -7f, 9.54f)
            close()
            moveTo(16.68f, 11.71f)
            curveToRelative(-0.25f, 0.91f, -0.62f, 1.75f, -1.03f, 2.45f)
            curveToRelative(-0.44f, 0.75f, -1.44f, 0.92f, -2.09f, 0.34f)
            lineToRelative(-0.22f, -0.19f)
            curveToRelative(-0.48f, -0.43f, -0.59f, -1.14f, -0.26f, -1.7f)
            curveToRelative(0.27f, -0.46f, 0.51f, -1f, 0.68f, -1.57f)
            curveToRelative(0.17f, -0.6f, 0.69f, -1.03f, 1.32f, -1.03f)
            horizontalLineToRelative(0.28f)
            curveToRelative(0.89f, 0f, 1.55f, 0.85f, 1.32f, 1.71f)
            close()
        }
    }.also { _Balloon = it }
