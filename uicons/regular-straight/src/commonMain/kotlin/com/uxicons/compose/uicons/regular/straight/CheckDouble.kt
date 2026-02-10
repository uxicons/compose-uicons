package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Rs.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 8.54f)
                lineToRelative(-13.58f, 13.58f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.8f, -0.0f, -1.56f, -0.32f, -2.12f, -0.89f)
                lineTo(0.31f, 16.5f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(5.57f, 5.61f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                lineToRelative(13.58f, -13.58f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(8.01f, 11.98f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.8f, 0f, 1.55f, -0.31f, 2.12f, -0.88f)
                lineTo(18.35f, 2.9f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-8.2f, 8.2f)
                curveToRelative(-0.19f, 0.19f, -0.4f, 0.31f, -0.71f, 0.29f)
                curveToRelative(-0.27f, -0.0f, -0.52f, -0.11f, -0.71f, -0.3f)
                lineTo(3.23f, 5.52f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(4.08f, 4.17f)
                curveToRelative(0.56f, 0.58f, 1.32f, 0.9f, 2.13f, 0.9f)
                close()
            }
        }.also { _CheckDouble = it}
