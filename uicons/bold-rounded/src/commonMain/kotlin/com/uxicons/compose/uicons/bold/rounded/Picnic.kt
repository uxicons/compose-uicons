package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picnic: ImageVector? = null

val Icons.Br.Picnic: ImageVector
    get() = _Picnic ?: UXIcon(name = "Picnic") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.2f, 9.18f)
            arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.15f, -1.13f)
            arcToRelative(9.12f, 9.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.11f, 0f)
            arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, 9.18f)
            arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, 2.66f)
            lineToRelative(1.01f, 6.89f)
            arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.26f, 24f)
            horizontalLineToRelative(9.5f)
            arcToRelative(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.2f, -5.27f)
            lineToRelative(1.01f, -6.89f)
            arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.2f, 9.18f)
            close()
            moveTo(12f, 3f)
            arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.02f, 5f)
            lineTo(5.98f, 8f)
            arcTo(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
            moveTo(20f, 18.3f)
            arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.77f, 21f)
            horizontalLineToRelative(-9.5f)
            arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.03f, 18.3f)
            lineTo(3.02f, 11.4f)
            arcToRelative(0.32f, 0.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, -0.26f)
            arcTo(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.42f, 11f)
            lineTo(8.37f, 11f)
            lineTo(12.7f, 15.33f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.23f, 0f)
            lineTo(20.26f, 11f)
            horizontalLineToRelative(0.35f)
            arcToRelative(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.14f)
            arcToRelative(0.31f, 0.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, 0.26f)
            close()
        }
    }.also { _Picnic = it }
