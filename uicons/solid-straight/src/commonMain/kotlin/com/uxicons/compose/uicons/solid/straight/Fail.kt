package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fail: ImageVector? = null

val Icons.Ss.Fail: ImageVector
    get() = _Fail ?: UXIcon(name = "Fail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.6f, 9.96f)
                lineToRelative(0.64f, 3.04f)
                horizontalLineToRelative(-1.69f)
                lineToRelative(0.69f, -3.1f)
                curveToRelative(0.03f, -0.15f, 0.1f, -0.25f, 0.18f, -0.3f)
                lineToRelative(0.02f, 0.01f)
                curveToRelative(0.02f, 0.02f, 0.12f, 0.12f, 0.17f, 0.35f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(15f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(13.5f, 16.0f)
                lineToRelative(-1.34f, -6.37f)
                curveToRelative(-0.14f, -0.67f, -0.52f, -1.21f, -1.03f, -1.46f)
                curveToRelative(-0.23f, -0.11f, -0.48f, -0.17f, -0.72f, -0.17f)
                curveToRelative(-0.28f, 0f, -0.56f, 0.07f, -0.82f, 0.23f)
                curveToRelative(-0.47f, 0.28f, -0.81f, 0.78f, -0.93f, 1.36f)
                lineToRelative(-1.36f, 6.42f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.31f, -1.4f)
                horizontalLineToRelative(2.38f)
                lineToRelative(0.29f, 1.4f)
                horizontalLineToRelative(1.63f)
                close()
                moveTo(15.6f, 8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                close()
                moveTo(20f, 14.4f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.6f)
                close()
            }
        }.also { _Fail = it}
