package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KnifeKitchen: ImageVector? = null

val Icons.Bs.KnifeKitchen: ImageVector
    get() = _KnifeKitchen ?: UXIcon(name = "KnifeKitchen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.83f, 7.86f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, 0f, -5.66f)
                curveToRelative(-1.56f, -1.56f, -4.1f, -1.56f, -5.66f, 0f)
                lineTo(1.54f, 17.82f)
                curveTo(0.55f, 18.81f, 0f, 20.13f, 0f, 21.53f)
                verticalLineToRelative(1.47f)
                reflectiveCurveToRelative(2.08f, 0.04f, 2.69f, 0.04f)
                curveToRelative(0.32f, 0f, 0.63f, -0.0f, 0.87f, -0.01f)
                curveToRelative(4f, -0.16f, 7.44f, -1.56f, 9.94f, -4.07f)
                lineToRelative(2.24f, -2.26f)
                reflectiveCurveToRelative(1.22f, 1.23f, 1.34f, 1.34f)
                lineToRelative(2.08f, -2.16f)
                lineToRelative(-0.3f, -0.3f)
                curveToRelative(-0.43f, -0.49f, -0.68f, -1.11f, -0.69f, -1.78f)
                curveToRelative(-0.02f, -0.77f, 0.27f, -1.49f, 0.81f, -2.03f)
                lineToRelative(3.85f, -3.9f)
                close()
                moveTo(11.38f, 16.84f)
                curveToRelative(-2.42f, 2.42f, -5.55f, 3.07f, -7.79f, 3.18f)
                curveToRelative(0.03f, -0.03f, 0.05f, -0.06f, 0.08f, -0.08f)
                lineToRelative(7.67f, -7.66f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-2.25f, 2.27f)
                close()
                moveTo(16.84f, 9.65f)
                curveToRelative(-0.69f, 0.7f, -1.18f, 1.54f, -1.44f, 2.45f)
                lineToRelative(-1.95f, -1.95f)
                lineToRelative(5.84f, -5.84f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, -0.01f, 1.42f)
                lineToRelative(-3.86f, 3.91f)
                close()
            }
        }.also { _KnifeKitchen = it}
