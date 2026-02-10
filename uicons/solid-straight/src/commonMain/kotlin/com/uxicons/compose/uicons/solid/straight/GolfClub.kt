package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfClub: ImageVector? = null

val Icons.Ss.GolfClub: ImageVector
    get() = _GolfClub ?: UXIcon(name = "GolfClub") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.02f, 0.02f)
                lineTo(20.01f, 11.98f)
                lineTo(6.17f, 9.07f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.08f)
                verticalLineToRelative(4.8f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.12f, 24f)
                horizontalLineToRelative(6.9f)
                arcToRelative(9.52f, 9.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.71f, -5.69f)
                arcTo(9.34f, 9.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.4f, 15.8f)
                lineTo(23.99f, 0.35f)
                close()
                moveTo(10.77f, 20.46f)
                lineTo(3.79f, 18.98f)
                lineToRelative(0.42f, -1.96f)
                lineToRelative(6.98f, 1.48f)
                close()
                moveTo(15.29f, 17.24f)
                lineTo(4.76f, 15.02f)
                lineToRelative(0.41f, -1.96f)
                lineTo(15.7f, 15.29f)
                close()
            }
        }.also { _GolfClub = it}
