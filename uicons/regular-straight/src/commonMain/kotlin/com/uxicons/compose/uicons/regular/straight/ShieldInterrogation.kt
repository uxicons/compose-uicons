package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldInterrogation: ImageVector? = null

val Icons.Rs.ShieldInterrogation: ImageVector
    get() = _ShieldInterrogation ?: UXIcon(name = "ShieldInterrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.94f, 8.28f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.01f, 4.22f)
                arcTo(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 14.26f)
                lineTo(13f, 15f)
                lineTo(11f, 15f)
                verticalLineToRelative(-0.74f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.96f, -3.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.0f, -2.12f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                lineTo(8f, 9f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.43f, 5.94f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.51f, 2.35f)
                close()
                moveTo(22f, 5.47f)
                verticalLineToRelative(6.52f)
                curveToRelative(0f, 7.44f, -7.05f, 10.85f, -9.21f, 11.72f)
                lineToRelative(-0.83f, 0.34f)
                lineToRelative(-0.8f, -0.4f)
                curveTo(9.01f, 22.57f, 2f, 18.55f, 2f, 11.99f)
                lineTo(2f, 5.47f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.05f, 2.62f)
                lineTo(12f, -0.01f)
                lineToRelative(7.95f, 2.63f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.47f)
                close()
                moveTo(20f, 5.47f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.68f, -0.94f)
                lineTo(12f, 2.1f)
                lineTo(4.68f, 4.52f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5.47f)
                verticalLineToRelative(6.52f)
                curveToRelative(0f, 5.42f, 6.16f, 8.92f, 8.05f, 9.86f)
                curveTo(13.91f, 21.1f, 20f, 18.17f, 20f, 11.99f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(2f)
                lineTo(13f, 17f)
                lineTo(11f, 17f)
                close()
            }
        }.also { _ShieldInterrogation = it}
