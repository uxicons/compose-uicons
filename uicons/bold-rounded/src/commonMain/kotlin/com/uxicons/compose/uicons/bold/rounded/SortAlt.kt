package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Br.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.07f, 17.45f)
            curveToRelative(0.58f, 0.59f, 0.58f, 1.54f, -0.01f, 2.12f)
            lineToRelative(-3.79f, 3.75f)
            curveToRelative(-0.48f, 0.48f, -1.12f, 0.73f, -1.76f, 0.73f)
            reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
            lineToRelative(-3.79f, -3.74f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, -0.01f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.59f, 2.12f, -0.01f)
            lineToRelative(1.95f, 1.92f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineTo(19.36f)
            lineToRelative(1.95f, -1.92f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.58f, 2.12f, 0.01f)
            close()
            moveTo(23.05f, 4.48f)
            lineToRelative(-3.79f, -3.74f)
            curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.53f, -0.01f)
            lineToRelative(-3.79f, 3.75f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
            curveToRelative(0.58f, 0.59f, 1.53f, 0.59f, 2.12f, 0.01f)
            lineToRelative(1.95f, -1.92f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(4.69f)
            lineToRelative(1.95f, 1.92f)
            curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
            curveToRelative(0.39f, 0f, 0.77f, -0.15f, 1.07f, -0.45f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            close()
        }
    }.also { _SortAlt = it }
