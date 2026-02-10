package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TireFlat: ImageVector? = null

val Icons.Br.TireFlat: ImageVector
    get() = _TireFlat ?: UXIcon(name = "TireFlat") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 24f)
            lineTo(3.5f, 24f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -4.76f)
            curveTo(-3.57f, 11.54f, 2.23f, -0.12f, 12f, 0f)
            curveToRelative(9.76f, -0.12f, 15.56f, 11.51f, 9.56f, 19.23f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 24f)
            close()
            moveTo(5.58f, 21f)
            lineTo(18.42f, 21f)
            arcToRelative(2.17f, 2.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.36f, -0.76f)
            arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, -2.47f)
            arcTo(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
            curveTo(4.5f, 2.91f, 0.21f, 12.01f, 5.07f, 17.72f)
            arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, 2.52f)
            arcTo(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.58f, 21f)
            close()
            moveTo(11.2f, 15.84f)
            lineTo(9.25f, 18.44f)
            arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 0f)
            lineToRelative(-1.95f, -2.6f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.2f, 15.84f)
            close()
            moveTo(8.84f, 13.98f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, -1.53f)
            lineTo(5.06f, 11.11f)
            arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, 5.58f)
            close()
            moveTo(10.5f, 8.58f)
            lineTo(10.5f, 5.17f)
            arcTo(7.02f, 7.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.08f, 8.28f)
            lineTo(9.13f, 9.51f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 8.58f)
            close()
            moveTo(14.87f, 9.51f)
            lineTo(17.92f, 8.29f)
            arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 5.17f)
            verticalLineToRelative(3.41f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.87f, 9.5f)
            close()
            moveTo(15.16f, 13.98f)
            lineTo(17.19f, 16.69f)
            arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -5.58f)
            lineTo(15.59f, 12.45f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.16f, 13.98f)
            close()
        }
    }.also { _TireFlat = it }
