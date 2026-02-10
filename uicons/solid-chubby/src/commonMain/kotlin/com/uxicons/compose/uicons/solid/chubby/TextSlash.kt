package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextSlash: ImageVector? = null

val Icons.Sc.TextSlash: ImageVector
    get() = _TextSlash ?: UXIcon(name = "TextSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 20.44f)
                lineToRelative(-9.06f, -9.06f)
                verticalLineToRelative(-6.35f)
                curveToRelative(2.64f, 0.08f, 4.42f, 0.37f, 5.42f, 0.59f)
                curveToRelative(-0.08f, 0.65f, -0.22f, 1.53f, -0.5f, 2.45f)
                curveToRelative(-0.24f, 0.79f, 0.2f, 1.63f, 1.0f, 1.87f)
                curveToRelative(0.77f, 0.24f, 1.63f, -0.2f, 1.87f, -1.0f)
                curveToRelative(0.71f, -2.31f, 0.71f, -4.35f, 0.71f, -4.44f)
                curveToRelative(0f, -0.61f, -0.37f, -1.17f, -0.94f, -1.39f)
                curveToRelative(-0.28f, -0.11f, -2.94f, -1.11f, -9.06f, -1.11f)
                curveToRelative(-3.3f, 0f, -5.73f, 0.29f, -7.3f, 0.57f)
                lineToRelative(-1.14f, -1.14f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
                moveTo(10.5f, 5.02f)
                verticalLineToRelative(3.35f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(0.9f, -0.1f, 1.95f, -0.17f, 3.15f, -0.21f)
                close()
                moveTo(13.5f, 18.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _TextSlash = it}
