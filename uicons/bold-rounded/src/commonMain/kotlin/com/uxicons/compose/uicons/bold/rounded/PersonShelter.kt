package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonShelter: ImageVector? = null

val Icons.Br.PersonShelter: ImageVector
    get() = _PersonShelter ?: UXIcon(name = "PersonShelter") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 11f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(17f, 16f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.47f, -0.81f, 2.75f, -2f, 3.44f)
            verticalLineToRelative(2.06f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.06f)
            curveToRelative(-1.19f, -0.69f, -2f, -1.97f, -2f, -3.44f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
            moveTo(10f, 17f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(1f)
            close()
            moveTo(21.58f, 5.33f)
            lineTo(15.08f, 0.94f)
            curveToRelative(-1.87f, -1.26f, -4.28f, -1.26f, -6.15f, 0f)
            lineTo(2.42f, 5.33f)
            curveToRelative(-1.52f, 1.02f, -2.42f, 2.73f, -2.42f, 4.56f)
            verticalLineToRelative(12.61f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-12.61f)
            curveToRelative(0f, -0.83f, 0.41f, -1.61f, 1.1f, -2.07f)
            lineToRelative(6.5f, -4.39f)
            curveToRelative(0.85f, -0.57f, 1.95f, -0.57f, 2.8f, 0f)
            lineToRelative(6.5f, 4.39f)
            curveToRelative(0.69f, 0.47f, 1.1f, 1.24f, 1.1f, 2.07f)
            verticalLineToRelative(12.61f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-12.61f)
            curveToRelative(0f, -1.83f, -0.91f, -3.54f, -2.42f, -4.56f)
            close()
        }
    }.also { _PersonShelter = it }
