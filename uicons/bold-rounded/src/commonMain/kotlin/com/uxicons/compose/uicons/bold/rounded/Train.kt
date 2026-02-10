package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Br.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 15.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 17f)
            close()
            moveTo(20.88f, 21.91f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.76f, 1.18f)
            lineToRelative(-0.88f, -2.05f)
            arcTo(13.65f, 13.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
            arcToRelative(13.67f, 13.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.24f, -0.96f)
            lineToRelative(-0.88f, 2.05f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.76f, -1.18f)
            lineToRelative(1.11f, -2.58f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.92f)
            lineTo(3f, 5.98f)
            arcTo(5.28f, 5.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.64f, 0.94f)
            arcTo(17.54f, 17.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
            arcToRelative(17.53f, 17.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.36f, 0.94f)
            arcTo(5.28f, 5.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.98f)
            verticalLineToRelative(9.93f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.23f, 3.41f)
            close()
            moveTo(6f, 6.25f)
            curveTo(6f, 8.2f, 8.12f, 12f, 12f, 12f)
            reflectiveCurveToRelative(6f, -3.8f, 6f, -5.75f)
            lineTo(18f, 5.98f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.43f, 3.79f)
            curveToRelative(-0.34f, -0.11f, -0.69f, -0.21f, -1.02f, -0.29f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4.5f)
            lineTo(10f, 4.5f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1f)
            curveToRelative(-0.34f, 0.09f, -0.68f, 0.18f, -1.02f, 0.29f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.98f)
            close()
            moveTo(12f, 19f)
            arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.87f, -1.08f)
            arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, -2f)
            lineTo(18f, 12.6f)
            arcToRelative(8.69f, 8.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 0f)
            verticalLineToRelative(3.32f)
            arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 2f)
            arcTo(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            close()
        }
    }.also { _Train = it }
