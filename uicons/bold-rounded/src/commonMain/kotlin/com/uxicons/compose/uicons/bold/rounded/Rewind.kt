package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rewind: ImageVector? = null

val Icons.Br.Rewind: ImageVector
    get() = _Rewind ?: UXIcon(name = "Rewind") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.49f, 20.81f)
            arcTo(4.14f, 4.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.04f, 20f)
            lineTo(1.7f, 15.35f)
            arcToRelative(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6.7f)
            lineTo(8.04f, 4f)
            arcToRelative(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.44f, 2.13f)
            lineTo(17.39f, 4f)
            arcTo(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 7.35f)
            verticalLineToRelative(9.3f)
            arcTo(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.39f, 20f)
            lineToRelative(-2.91f, -2.13f)
            arcToRelative(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.98f, 2.94f)
            close()
            moveTo(10.48f, 6.19f)
            arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, 0.23f)
            lineTo(3.47f, 11.07f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.87f)
            lineToRelative(6.34f, 4.65f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.84f, -0.93f)
            lineTo(11.65f, 15.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.39f, -1.21f)
            lineToRelative(5.12f, 3.75f)
            arcTo(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16.65f)
            verticalLineToRelative(-9.3f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, -0.93f)
            lineToRelative(-5.12f, 3.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.39f, -1.21f)
            lineTo(11.65f, 7.35f)
            arcToRelative(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, -1.03f)
            arcTo(1.22f, 1.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.48f, 6.19f)
            close()
        }
    }.also { _Rewind = it }
