package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCheck: ImageVector? = null

val Icons.Ss.TrashCheck: ImageVector
    get() = _TrashCheck ?: UXIcon(name = "TrashCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(1f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.64f)
                lineToRelative(1.7f, 15.33f)
                curveToRelative(0.17f, 1.52f, 1.45f, 2.67f, 2.98f, 2.67f)
                horizontalLineToRelative(9.3f)
                curveToRelative(1.53f, 0f, 2.81f, -1.15f, 2.98f, -2.67f)
                lineToRelative(1.7f, -15.33f)
                horizontalLineToRelative(1.68f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11.91f, 16.42f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.59f)
                lineToRelative(-2.5f, -2.41f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.51f, 2.42f)
                lineToRelative(5.4f, -5.29f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-5.38f, 5.3f)
                close()
            }
        }.also { _TrashCheck = it}
