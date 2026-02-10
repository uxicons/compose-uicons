package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tire: ImageVector? = null

val Icons.Br.Tire: ImageVector
    get() = _Tire ?: UXIcon(name = "Tire") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
            curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
            curveTo(3.45f, 0.08f, 20.55f, 0.08f, 21f, 12f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
            moveTo(8.84f, 13.98f)
            lineTo(6.81f, 16.68f)
            arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, -5.58f)
            lineTo(8.41f, 12.45f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.84f, 13.98f)
            close()
            moveTo(9.13f, 9.51f)
            lineTo(6.08f, 8.28f)
            arcTo(7.02f, 7.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 5.17f)
            verticalLineToRelative(3.41f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.13f, 9.51f)
            close()
            moveTo(17.92f, 8.29f)
            lineTo(14.87f, 9.5f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 8.58f)
            lineTo(13.5f, 5.17f)
            arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.92f, 8.29f)
            close()
            moveTo(19f, 12f)
            arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, 4.68f)
            lineToRelative(-2.03f, -2.71f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -1.53f)
            lineToRelative(3.35f, -1.34f)
            arcTo(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
            close()
            moveTo(12.8f, 15.84f)
            lineTo(14.75f, 18.44f)
            arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 0f)
            lineToRelative(1.95f, -2.6f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.8f, 15.84f)
            close()
        }
    }.also { _Tire = it }
