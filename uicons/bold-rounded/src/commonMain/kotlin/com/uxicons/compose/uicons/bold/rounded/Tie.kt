package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Br.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.31f, 15.2f)
            lineToRelative(-2.75f, -8.72f)
            lineToRelative(0.81f, -2.84f)
            curveToRelative(0.28f, -0.84f, 0.13f, -1.77f, -0.39f, -2.49f)
            curveToRelative(-0.52f, -0.72f, -1.36f, -1.15f, -2.24f, -1.15f)
            horizontalLineToRelative(-3.49f)
            curveToRelative(-0.89f, 0f, -1.73f, 0.43f, -2.24f, 1.15f)
            curveToRelative(-0.52f, 0.72f, -0.66f, 1.65f, -0.41f, 2.43f)
            lineToRelative(0.83f, 2.9f)
            lineToRelative(-2.74f, 8.69f)
            curveToRelative(-0.56f, 1.69f, -0.08f, 3.56f, 1.24f, 4.75f)
            lineToRelative(4.05f, 3.69f)
            curveToRelative(0.29f, 0.26f, 0.65f, 0.39f, 1.01f, 0.39f)
            reflectiveCurveToRelative(0.72f, -0.13f, 1.01f, -0.39f)
            lineToRelative(4.05f, -3.69f)
            curveToRelative(1.32f, -1.2f, 1.81f, -3.06f, 1.25f, -4.73f)
            close()
            moveTo(13.44f, 3f)
            lineToRelative(-0.57f, 2f)
            horizontalLineToRelative(-1.74f)
            lineToRelative(-0.57f, -2f)
            horizontalLineToRelative(2.88f)
            close()
            moveTo(15.04f, 17.7f)
            lineToRelative(-3.04f, 2.77f)
            lineToRelative(-3.04f, -2.77f)
            curveToRelative(-0.44f, -0.4f, -0.6f, -1.02f, -0.41f, -1.61f)
            lineToRelative(2.55f, -8.1f)
            horizontalLineToRelative(1.8f)
            lineToRelative(2.56f, 8.12f)
            curveToRelative(0.19f, 0.56f, 0.03f, 1.19f, -0.41f, 1.58f)
            close()
        }
    }.also { _Tie = it }
