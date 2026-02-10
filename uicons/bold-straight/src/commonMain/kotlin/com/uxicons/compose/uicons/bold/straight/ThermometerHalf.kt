package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerHalf: ImageVector? = null

val Icons.Bs.ThermometerHalf: ImageVector
    get() = _ThermometerHalf ?: UXIcon(name = "ThermometerHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.6f)
                lineTo(10.5f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                close()
                moveTo(20f, 15.96f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                curveToRelative(-6.77f, 0.09f, -10.56f, -8.26f, -6f, -13.27f)
                lineTo(6f, 6f)
                curveToRelative(0.25f, -7.93f, 11.75f, -7.93f, 12f, 0f)
                verticalLineToRelative(4.69f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 15.96f)
                close()
                moveTo(17f, 15.96f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
                lineTo(15f, 11.93f)
                lineTo(15f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                verticalLineToRelative(5.93f)
                lineToRelative(-0.46f, 0.44f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17f, 15.96f)
                close()
            }
        }.also { _ThermometerHalf = it}
