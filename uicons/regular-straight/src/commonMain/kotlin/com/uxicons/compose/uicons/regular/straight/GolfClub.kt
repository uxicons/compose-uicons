package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfClub: ImageVector? = null

val Icons.Rs.GolfClub: ImageVector
    get() = _GolfClub ?: UXIcon(name = "GolfClub") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 24f)
                lineTo(5.12f, 24f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.88f)
                verticalLineToRelative(-4.8f)
                arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.17f, -5.01f)
                lineTo(20.01f, 11.98f)
                lineTo(22.02f, 0.02f)
                lineTo(23.99f, 0.35f)
                lineTo(21.4f, 15.8f)
                arcToRelative(9.34f, 9.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, 2.51f)
                arcTo(9.52f, 9.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 24f)
                close()
                moveTo(5.11f, 10.96f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 14.08f)
                verticalLineToRelative(4.8f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.12f, 22f)
                horizontalLineToRelative(6.9f)
                arcTo(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.9f, 17.51f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.52f, -2.01f)
                lineToRelative(0.26f, -1.54f)
                lineTo(5.76f, 11.02f)
                arcTo(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 10.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.76f, 15.03f)
                lineToRelative(0.41f, -1.96f)
                lineToRelative(10.53f, 2.22f)
                lineToRelative(-0.41f, 1.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.79f, 18.98f)
                lineToRelative(0.42f, -1.96f)
                lineToRelative(6.98f, 1.48f)
                lineToRelative(-0.42f, 1.96f)
                close()
            }
        }.also { _GolfClub = it}
