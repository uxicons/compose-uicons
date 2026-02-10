package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KnifeKitchen: ImageVector? = null

val Icons.Sc.KnifeKitchen: ImageVector
    get() = _KnifeKitchen ?: UXIcon(name = "KnifeKitchen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.03f, 8.61f)
                curveToRelative(2.89f, -2.87f, 5.69f, -5.65f, 6.31f, -6.27f)
                curveToRelative(1.79f, -1.79f, 3.53f, -1.79f, 5.32f, 0f)
                curveToRelative(0.9f, 0.9f, 1.34f, 1.77f, 1.34f, 2.66f)
                reflectiveCurveToRelative(-0.44f, 1.76f, -1.34f, 2.66f)
                curveToRelative(-1.39f, 1.39f, -3.06f, 3.13f, -3.06f, 3.13f)
                curveToRelative(-1.41f, 1.41f, -1.41f, 2.22f, -0.01f, 3.62f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.34f, 0.34f, -0.85f, 0.37f, -1.24f, 0.12f)
                lineToRelative(-7.33f, -7.33f)
                close()
                moveTo(8.61f, 10.02f)
                curveToRelative(-3.05f, 3.03f, -5.84f, 5.8f, -5.87f, 5.83f)
                curveToRelative(-1.19f, 1.39f, -1.74f, 3.34f, -1.74f, 6.15f)
                curveToRelative(0.02f, 0.68f, 0.57f, 1.06f, 1.25f, 1.01f)
                curveToRelative(1.3f, 0f, 5.25f, -0.01f, 12.25f, -7.01f)
                lineToRelative(-5.89f, -5.98f)
                close()
            }
        }.also { _KnifeKitchen = it}
