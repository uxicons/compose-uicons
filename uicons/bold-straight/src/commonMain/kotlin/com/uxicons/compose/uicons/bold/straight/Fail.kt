package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fail: ImageVector? = null

val Icons.Bs.Fail: ImageVector
    get() = _Fail ?: UXIcon(name = "Fail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                close()
                moveTo(18.6f, 8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(-6.4f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                close()
                moveTo(12.16f, 9.63f)
                lineToRelative(1.34f, 6.37f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(-0.29f, -1.4f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(-0.31f, 1.4f)
                horizontalLineToRelative(-1.58f)
                lineToRelative(1.36f, -6.42f)
                curveToRelative(0.12f, -0.58f, 0.46f, -1.08f, 0.93f, -1.36f)
                curveToRelative(0.26f, -0.15f, 0.54f, -0.23f, 0.82f, -0.23f)
                curveToRelative(0.24f, 0f, 0.49f, 0.06f, 0.72f, 0.17f)
                curveToRelative(0.51f, 0.25f, 0.9f, 0.79f, 1.03f, 1.46f)
                close()
                moveTo(11.24f, 13f)
                lineToRelative(-0.64f, -3.04f)
                curveToRelative(-0.05f, -0.23f, -0.12f, -0.35f, -0.18f, -0.35f)
                reflectiveCurveToRelative(-0.15f, 0.15f, -0.18f, 0.3f)
                lineToRelative(-0.69f, 3.1f)
                horizontalLineToRelative(1.69f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(14.5f)
                lineTo(0f, 21f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 6.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 6.5f)
                close()
            }
        }.also { _Fail = it}
