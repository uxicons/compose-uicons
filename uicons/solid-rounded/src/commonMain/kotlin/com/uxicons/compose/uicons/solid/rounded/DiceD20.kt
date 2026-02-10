package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD20: ImageVector? = null

val Icons.Sr.DiceD20: ImageVector
    get() = _DiceD20 ?: UXIcon(name = "DiceD20") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.2f, 11f)
                lineTo(12f, 16.11f)
                lineTo(8.8f, 11f)
                close()
                moveTo(10.02f, 16.71f)
                lineTo(6.94f, 11.8f)
                lineTo(3.83f, 16.16f)
                close()
                moveTo(17.25f, 8.35f)
                lineTo(21.95f, 5.53f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.37f, -1.22f)
                lineToRelative(-6f, -3.6f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.71f, 0.05f)
                curveTo(12.78f, 0.11f, 17.25f, 8.35f, 17.25f, 8.35f)
                close()
                moveTo(15.32f, 9f)
                lineTo(12f, 2.85f)
                lineTo(8.68f, 9f)
                close()
                moveTo(17.06f, 11.8f)
                lineTo(14f, 16.69f)
                lineToRelative(6.17f, -0.53f)
                close()
                moveTo(6.75f, 8.35f)
                reflectiveCurveTo(11.22f, 0.11f, 11.29f, 0.05f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.43f, 0.71f)
                lineToRelative(-6f, 3.6f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.06f, 5.53f)
                close()
                moveTo(18.28f, 10.07f)
                reflectiveCurveToRelative(4.58f, 6.41f, 4.6f, 6.45f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 15.4f)
                lineTo(23f, 8.6f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, -1.27f)
                close()
                moveTo(13f, 18.78f)
                lineTo(13f, 23.9f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, -0.61f)
                lineToRelative(6f, -3.6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, -1.73f)
                curveTo(22.23f, 17.98f, 13f, 18.78f, 13f, 18.78f)
                close()
                moveTo(5.72f, 10.07f)
                lineTo(1.17f, 7.33f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, 1.11f)
                curveTo(1.15f, 16.48f, 5.72f, 10.07f, 5.72f, 10.07f)
                close()
                moveTo(11f, 18.8f)
                reflectiveCurveToRelative(-9.23f, -0.82f, -9.29f, -0.84f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, 1.73f)
                lineToRelative(6f, 3.6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 23.9f)
                close()
            }
        }.also { _DiceD20 = it}
