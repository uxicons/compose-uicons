package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MilkAlt: ImageVector? = null

val Icons.Sc.MilkAlt: ImageVector
    get() = _MilkAlt ?: UXIcon(name = "MilkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.11f, 21.17f)
                curveToRelative(-0.03f, 0.3f, -0.19f, 0.58f, -0.44f, 0.74f)
                curveToRelative(-0.27f, 0.18f, -1.87f, 1.09f, -6.67f, 1.09f)
                reflectiveCurveToRelative(-6.39f, -0.91f, -6.67f, -1.09f)
                curveToRelative(-0.25f, -0.17f, -0.41f, -0.44f, -0.44f, -0.74f)
                curveToRelative(-0.01f, -0.12f, -0.12f, -1.46f, -0.23f, -3.17f)
                horizontalLineToRelative(9.33f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-9.39f)
                curveToRelative(0.17f, -1.69f, 0.74f, -2.74f, 1.25f, -3.66f)
                curveToRelative(0.44f, -0.8f, 0.85f, -1.56f, 1.04f, -2.82f)
                curveToRelative(-0.54f, -0.02f, -1.04f, -0.34f, -1.28f, -0.86f)
                curveToRelative(-0.35f, -0.75f, 0f, -1.66f, 0.75f, -2.01f)
                curveToRelative(0.32f, -0.15f, 1.68f, -0.64f, 5.64f, -0.64f)
                reflectiveCurveToRelative(5.32f, 0.49f, 5.64f, 0.64f)
                curveToRelative(0.75f, 0.35f, 1.07f, 1.25f, 0.72f, 2.0f)
                curveToRelative(-0.24f, 0.51f, -0.73f, 0.82f, -1.26f, 0.85f)
                curveToRelative(0.18f, 1.28f, 0.61f, 2.05f, 1.05f, 2.85f)
                curveToRelative(0.51f, 0.93f, 1.09f, 1.98f, 1.25f, 3.72f)
                curveToRelative(0.33f, 2.87f, -0.27f, 9.81f, -0.29f, 10.11f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.01f, 0.93f, 0.02f, 1.98f, 0.06f, 3f)
                horizontalLineToRelative(8.44f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _MilkAlt = it}
