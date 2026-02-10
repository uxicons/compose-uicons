package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Br.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.01f, 17.5f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.76f, 4.99f)
            arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 4.18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.85f, 1.1f)
            arcToRelative(3.32f, 3.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.04f, 3.16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(1.27f, 1.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.02f, -0.22f)
            arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.47f, -0.31f)
            arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, -7.9f)
            close()
        }
    }.also { _Interrogation = it }
