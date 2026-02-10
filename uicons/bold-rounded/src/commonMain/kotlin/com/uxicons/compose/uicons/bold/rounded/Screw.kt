package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screw: ImageVector? = null

val Icons.Br.Screw: ImageVector
    get() = _Screw ?: UXIcon(name = "Screw") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.88f, 0f)
            horizontalLineToRelative(-7.76f)
            curveToRelative(-1.17f, 0f, -2.12f, 0.95f, -2.12f, 2.12f)
            curveToRelative(0f, 0.56f, 0.22f, 1.1f, 0.62f, 1.5f)
            lineToRelative(1.38f, 1.38f)
            verticalLineToRelative(13.35f)
            curveToRelative(0f, 1.47f, 0.57f, 2.85f, 1.61f, 3.89f)
            lineToRelative(1.33f, 1.33f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(1.33f, -1.33f)
            curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
            lineTo(16.0f, 5.02f)
            lineToRelative(1.39f, -1.4f)
            curveToRelative(0.39f, -0.4f, 0.61f, -0.93f, 0.61f, -1.49f)
            verticalLineToRelative(-0.01f)
            curveToRelative(0f, -1.17f, -0.95f, -2.12f, -2.12f, -2.12f)
            close()
            moveTo(13f, 18.34f)
            curveToRelative(0f, 0.66f, -0.27f, 1.3f, -0.73f, 1.77f)
            lineToRelative(-0.27f, 0.27f)
            lineToRelative(-0.27f, -0.27f)
            curveToRelative(-0.47f, -0.47f, -0.73f, -1.11f, -0.73f, -1.77f)
            verticalLineToRelative(-0.78f)
            lineToRelative(2f, -2f)
            verticalLineToRelative(2.78f)
            close()
            moveTo(13f, 12.73f)
            lineToRelative(-2f, 2f)
            verticalLineToRelative(-2.82f)
            lineToRelative(2f, -2f)
            verticalLineToRelative(2.82f)
            close()
            moveTo(13f, 7.09f)
            lineToRelative(-2f, 2f)
            verticalLineToRelative(-4.08f)
            lineToRelative(2f, 0.01f)
            verticalLineToRelative(2.07f)
            close()
        }
    }.also { _Screw = it }
