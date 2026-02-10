package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Br.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.42f, 10f)
            arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.44f, -3.06f)
            arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.96f, -4.38f)
            arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 12.38f)
            arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.19f, 18.69f)
            arcTo(5.85f, 5.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, 23f)
            lineTo(15.58f, 23f)
            arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.3f, -6.76f)
            arcTo(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.42f, 10f)
            close()
            moveTo(20.92f, 15.73f)
            arcTo(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.58f, 20f)
            lineTo(5.94f, 20f)
            arcTo(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 17.96f)
            arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -3.45f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, -2.35f)
            arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.38f, -8.2f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.78f, -0.06f)
            arcToRelative(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.12f, 1.04f)
            arcTo(5.21f, 5.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.22f, 8.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 1.29f)
            arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11.77f)
            arcTo(5.16f, 5.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.92f, 15.73f)
            close()
        }
    }.also { _Cloud = it }
