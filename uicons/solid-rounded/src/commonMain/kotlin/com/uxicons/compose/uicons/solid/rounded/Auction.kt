package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Auction: ImageVector? = null

val Icons.Sr.Auction: ImageVector
    get() = _Auction ?: UXIcon(name = "Auction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.39f, 9.11f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineTo(12.79f, 0.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-7.4f, 7.4f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                close()
                moveTo(13.89f, 17.6f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(7.4f, -7.4f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-7.4f, 7.4f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(13.37f, 14.05f)
                lineToRelative(5.87f, -5.87f)
                lineToRelative(-4.41f, -4.41f)
                lineToRelative(-5.87f, 5.87f)
                lineToRelative(1.5f, 1.5f)
                lineTo(0.29f, 21.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(10.16f, -10.16f)
                lineToRelative(1.5f, 1.5f)
                close()
                moveTo(23f, 22f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Auction = it}
