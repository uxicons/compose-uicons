package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShowersHeavy: ImageVector? = null

val Icons.Br.CloudShowersHeavy: ImageVector
    get() = _CloudShowersHeavy ?: UXIcon(name = "CloudShowersHeavy") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 24f)
            arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.47f, -0.08f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.95f, -1.9f)
            lineToRelative(2f, -6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.85f, 0.95f)
            lineToRelative(-2f, 6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 24f)
            close()
            moveTo(7.92f, 22.98f)
            lineToRelative(2f, -6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.85f, -0.95f)
            lineToRelative(-2f, 6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, 1.9f)
            arcTo(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 24f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.92f, 22.98f)
            close()
            moveTo(19.08f, 19.89f)
            curveTo(26.03f, 16.9f, 25.44f, 6.49f, 17.81f, 4.92f)
            arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.24f)
            arcTo(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.56f, 0.14f)
            arcTo(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 6.79f)
            arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 2.95f)
            arcTo(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.9f, 10.1f)
            arcToRelative(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, 9.15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.67f, -2.49f)
            arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.42f, -4.44f)
            arcTo(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9.17f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, -1.89f)
            arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.79f, -1.32f)
            arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 1.9f)
            curveToRelative(4.73f, 0.95f, 4.94f, 7.45f, 0.7f, 9.25f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, 2.77f)
            close()
        }
    }.also { _CloudShowersHeavy = it }
