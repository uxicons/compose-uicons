package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WorkInProgress: ImageVector? = null

val Icons.Rs.WorkInProgress: ImageVector
    get() = _WorkInProgress ?: UXIcon(name = "WorkInProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 10.5f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                close()
                moveTo(22.96f, 14.52f)
                lineToRelative(-8.44f, 8.44f)
                curveToRelative(-0.68f, 0.68f, -1.6f, 1.02f, -2.52f, 1.02f)
                reflectiveCurveToRelative(-1.84f, -0.34f, -2.52f, -1.02f)
                lineTo(1.04f, 14.52f)
                curveToRelative(-1.39f, -1.39f, -1.39f, -3.65f, 0f, -5.04f)
                lineTo(9.48f, 1.04f)
                curveToRelative(1.34f, -1.34f, 3.7f, -1.34f, 5.04f, -0.0f)
                lineToRelative(8.44f, 8.44f)
                curveToRelative(1.39f, 1.39f, 1.39f, 3.65f, 0f, 5.04f)
                close()
                moveTo(7.35f, 6f)
                horizontalLineToRelative(9.3f)
                lineToRelative(-3.54f, -3.54f)
                curveToRelative(-0.59f, -0.59f, -1.62f, -0.59f, -2.21f, 0f)
                lineToRelative(-3.54f, 3.54f)
                close()
                moveTo(12.5f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(6.61f, 15.36f)
                lineToRelative(1.16f, -2.56f)
                lineToRelative(1.16f, 2.56f)
                curveToRelative(0.18f, 0.4f, 0.5f, 0.64f, 0.84f, 0.64f)
                curveToRelative(0.52f, 0f, 0.94f, -0.29f, 0.99f, -1f)
                lineToRelative(0.51f, -7f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-0.32f, 4.4f)
                lineToRelative(-1.58f, -3.47f)
                lineToRelative(-1.58f, 3.47f)
                lineToRelative(-0.32f, -4.4f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(0.51f, 7f)
                curveToRelative(0.04f, 0.7f, 0.47f, 1f, 0.99f, 1f)
                curveToRelative(0.34f, 0f, 0.66f, -0.24f, 0.84f, -0.64f)
                close()
                moveTo(16.65f, 18f)
                lineTo(7.35f, 18f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(0.58f, 0.58f, 1.63f, 0.58f, 2.21f, 0f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(20.1f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _WorkInProgress = it}
