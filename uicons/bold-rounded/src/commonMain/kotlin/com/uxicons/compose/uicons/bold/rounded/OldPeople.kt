package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OldPeople: ImageVector? = null

val Icons.Br.OldPeople: ImageVector
    get() = _OldPeople ?: UXIcon(name = "OldPeople") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(21f, 14f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7.61f)
            curveToRelative(-0.96f, -0.56f, -1.86f, -1.22f, -2.68f, -1.97f)
            curveToRelative(-0.16f, 1.51f, -0.28f, 3.24f, -0.31f, 5.61f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.01f, 1.19f, -0.88f, 2.19f, -2.01f, 2.42f)
            verticalLineToRelative(1.55f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.85f)
            curveToRelative(-0.41f, -0.19f, -0.78f, -0.46f, -1.09f, -0.8f)
            curveToRelative(-0.66f, -0.72f, -0.98f, -1.7f, -0.9f, -2.67f)
            curveToRelative(0.66f, -7.11f, 3.39f, -11.18f, 7.49f, -11.18f)
            curveToRelative(1.88f, -0.09f, 3.28f, 1.46f, 4.21f, 2.91f)
            curveToRelative(1.17f, 1.57f, 2.71f, 2.87f, 4.46f, 3.75f)
            curveToRelative(0.51f, 0.25f, 0.83f, 0.77f, 0.83f, 1.34f)
            close()
            moveTo(7.0f, 17.46f)
            curveToRelative(0.01f, 0.35f, 0.14f, 0.49f, 0.5f, 0.54f)
            horizontalLineToRelative(4.51f)
            curveToRelative(0.06f, -3.35f, 0.32f, -5.53f, 0.56f, -7.46f)
            curveToRelative(0.16f, -0.77f, -0.18f, -1.49f, -1.07f, -1.54f)
            curveToRelative(-3.53f, 0f, -4.37f, 7.05f, -4.5f, 8.46f)
            close()
        }
    }.also { _OldPeople = it }
