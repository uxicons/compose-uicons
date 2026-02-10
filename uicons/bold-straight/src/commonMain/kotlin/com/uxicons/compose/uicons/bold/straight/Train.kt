package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Bs.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4.5f)
                arcToRelative(3.22f, 3.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.2f, -3.05f)
                arcTo(19.04f, 19.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(19.05f, 19.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.2f, 1.45f)
                arcTo(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.5f)
                lineTo(3f, 18.08f)
                lineToRelative(0.23f, 0.37f)
                arcTo(6.1f, 6.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.68f, 19.9f)
                lineTo(3f, 24f)
                lineTo(6.08f, 24f)
                lineToRelative(1.13f, -2.77f)
                arcTo(14.05f, 14.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcToRelative(14.05f, 14.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.77f)
                lineTo(17.92f, 24f)
                lineTo(21f, 24f)
                lineToRelative(-1.68f, -4.1f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.45f, -1.45f)
                lineTo(21f, 18.08f)
                close()
                moveTo(6.31f, 4.24f)
                arcTo(19.69f, 19.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3.39f)
                lineTo(9f, 5f)
                horizontalLineToRelative(6f)
                lineTo(15f, 3.39f)
                arcToRelative(19.69f, 19.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.69f, 0.85f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.31f, 0.44f)
                curveTo(17.93f, 8.64f, 15.7f, 11f, 12f, 11f)
                reflectiveCurveTo(6.07f, 8.64f, 6.01f, 4.68f)
                arcTo(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.31f, 4.24f)
                close()
                moveTo(6f, 17.11f)
                lineTo(6f, 11.94f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -2.06f)
                verticalLineToRelative(5.17f)
                curveTo(17.41f, 17.7f, 15.69f, 19f, 12f, 19f)
                curveTo(8.29f, 19f, 6.57f, 17.69f, 6f, 17.11f)
                close()
                moveTo(13.5f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 16.5f)
                close()
            }
        }.also { _Train = it}
