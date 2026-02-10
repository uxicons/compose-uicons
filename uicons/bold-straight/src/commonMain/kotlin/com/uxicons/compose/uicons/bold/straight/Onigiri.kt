package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onigiri: ImageVector? = null

val Icons.Bs.Onigiri: ImageVector
    get() = _Onigiri ?: UXIcon(name = "Onigiri") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.11f, 14.75f)
                lineToRelative(-6.69f, -11.18f)
                curveToRelative(-0.98f, -1.64f, -2.61f, -2.57f, -4.46f, -2.57f)
                curveToRelative(-1.87f, 0f, -3.5f, 0.94f, -4.49f, 2.58f)
                lineToRelative(-6.69f, 11.17f)
                curveToRelative(-1.0f, 1.68f, -1.05f, 3.72f, -0.13f, 5.45f)
                curveToRelative(0.94f, 1.76f, 2.66f, 2.8f, 4.61f, 2.8f)
                horizontalLineToRelative(13.36f)
                curveToRelative(1.93f, 0f, 3.91f, -1.28f, 4.83f, -3.12f)
                curveToRelative(0.82f, -1.64f, 0.7f, -3.37f, -0.35f, -5.13f)
                close()
                moveTo(14.94f, 20f)
                horizontalLineToRelative(-5.97f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.97f)
                close()
                moveTo(20.79f, 18.53f)
                curveToRelative(-0.4f, 0.81f, -1.37f, 1.47f, -2.16f, 1.47f)
                horizontalLineToRelative(-0.71f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-11.95f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-0.71f)
                curveToRelative(-0.84f, 0f, -1.56f, -0.45f, -1.98f, -1.22f)
                curveToRelative(-0.42f, -0.79f, -0.4f, -1.72f, 0.06f, -2.48f)
                lineToRelative(6.69f, -11.17f)
                curveToRelative(0.43f, -0.72f, 1.11f, -1.12f, 1.92f, -1.12f)
                curveToRelative(0.82f, 0f, 1.46f, 0.38f, 1.9f, 1.12f)
                lineToRelative(6.69f, 11.17f)
                curveToRelative(0.62f, 1.03f, 0.54f, 1.64f, 0.24f, 2.24f)
                close()
            }
        }.also { _Onigiri = it}
