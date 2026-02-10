package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingsWedding: ImageVector? = null

val Icons.Br.RingsWedding: ImageVector
    get() = _RingsWedding ?: UXIcon(name = "RingsWedding") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.16f, 3.17f)
            lineToRelative(0.5f, 1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.34f, 2.83f)
            lineToRelative(-0.5f, -1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.16f, 3.17f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.16f, 1.82f)
            lineToRelative(-0.5f, 1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.68f, 1.35f)
            lineToRelative(0.5f, -1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.68f, -1.35f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1.5f)
            verticalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8f)
            arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.09f, 1.83f)
            arcToRelative(7.34f, 7.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, -0.52f)
            lineToRelative(0.74f, -1.47f)
            arcToRelative(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.69f, -2.27f)
            arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 5f)
            arcToRelative(4.22f, 4.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.29f, 0.65f)
            arcToRelative(1.69f, 1.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.56f, 2.18f)
            lineToRelative(0.74f, 1.48f)
            arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.29f, 13.41f)
            arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 8f)
            close()
            moveTo(3f, 16.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
            arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.44f, 0.26f)
            arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, 8.29f)
            arcTo(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 21f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.5f)
            close()
            moveTo(16f, 21f)
            arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.16f, -0.51f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.51f, -8.7f)
            arcTo(5.0f, 5.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 21f)
            close()
        }
    }.also { _RingsWedding = it }
