package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FieldHockey: ImageVector? = null

val Icons.Rs.FieldHockey: ImageVector
    get() = _FieldHockey ?: UXIcon(name = "FieldHockey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.93f, 0.01f)
                lineTo(7.79f, 17.54f)
                arcTo(0.96f, 0.96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.15f, 16.53f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.11f, -3.15f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 24f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.63f, -0.19f)
                arcToRelative(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.31f, -3.11f)
                lineTo(24.04f, 3.16f)
                close()
                moveTo(19.56f, 2.75f)
                lineTo(21.26f, 3.8f)
                lineTo(16.86f, 10.72f)
                lineTo(15.2f, 9.62f)
                close()
                moveTo(11.19f, 19.64f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.45f, -5.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.7f, 1.05f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.48f, 18.6f)
                lineToRelative(4.64f, -7.29f)
                lineToRelative(1.67f, 1.1f)
                close()
                moveTo(20.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 17f)
                close()
                moveTo(20.5f, 22f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 22f)
                close()
            }
        }.also { _FieldHockey = it}
