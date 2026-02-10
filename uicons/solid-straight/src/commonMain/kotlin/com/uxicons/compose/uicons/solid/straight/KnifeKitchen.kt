package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KnifeKitchen: ImageVector? = null

val Icons.Ss.KnifeKitchen: ImageVector
    get() = _KnifeKitchen ?: UXIcon(name = "KnifeKitchen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.01f, 11.32f)
                lineToRelative(5.23f, 5.25f)
                lineToRelative(-2.51f, 2.52f)
                curveToRelative(-2.18f, 2.19f, -5.52f, 3.76f, -9.02f, 3.9f)
                curveToRelative(-0.21f, 0.01f, -2.71f, 0.01f, -2.71f, 0.01f)
                curveToRelative(0f, -1.7f, 0.67f, -3.32f, 1.87f, -4.52f)
                lineToRelative(7.14f, -7.16f)
                close()
                moveTo(19.27f, 10.94f)
                curveToRelative(-0.68f, 0.69f, -1.05f, 1.62f, -1.02f, 2.59f)
                curveToRelative(0.02f, 0.84f, 0.33f, 1.63f, 0.87f, 2.25f)
                lineToRelative(0.32f, 0.33f)
                lineToRelative(-1.39f, 1.44f)
                curveToRelative(-0.11f, -0.11f, -7.83f, -7.85f, -7.83f, -7.85f)
                lineToRelative(7.61f, -7.63f)
                curveToRelative(1.37f, -1.37f, 3.75f, -1.37f, 5.12f, 0f)
                curveToRelative(1.41f, 1.41f, 1.41f, 3.72f, 0f, 5.13f)
                lineToRelative(-3.68f, 3.75f)
                close()
                moveTo(20f, 6.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _KnifeKitchen = it}
