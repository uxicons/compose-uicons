package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Br.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.79f, 4.26f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.25f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            arcToRelative(10.95f, 10.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.49f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.65f, 12f)
            arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.24f, -4.2f)
            lineTo(15.41f, 1.68f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.64f, 0.2f)
            arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.25f, 4.77f)
            lineTo(5.5f, 4.77f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 5.5f)
            verticalLineToRelative(3.46f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
            horizontalLineToRelative(0.75f)
            arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.64f, 23.8f)
            arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, 0.03f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
            lineTo(15.41f, 16.2f)
            arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.65f, 12f)
            close()
            moveTo(12.41f, 20.32f)
            arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.12f, -3.42f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.26f, -0.68f)
            lineTo(5.5f, 16.23f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
            lineTo(3f, 10.27f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
            lineTo(7.03f, 7.77f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.26f, -0.68f)
            arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.12f, -3.42f)
            close()
        }
    }.also { _Volume = it }
