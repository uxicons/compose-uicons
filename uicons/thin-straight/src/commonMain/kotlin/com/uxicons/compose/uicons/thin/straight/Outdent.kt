package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Outdent: ImageVector? = null

val Icons.Ts.Outdent: ImageVector
    get() = _Outdent ?: UXIcon(name = "Outdent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.46f, 13.02f)
                lineToRelative(4.54f, 4.07f)
                lineTo(5f, 6.88f)
                lineTo(0.46f, 10.95f)
                curveTo(0.17f, 11.21f, -0.0f, 11.59f, -0.0f, 11.98f)
                curveToRelative(0f, 0.4f, 0.17f, 0.77f, 0.46f, 1.03f)
                close()
                moveTo(1.13f, 11.7f)
                lineToRelative(2.87f, -2.58f)
                verticalLineToRelative(5.73f)
                lineToRelative(-2.87f, -2.58f)
                curveToRelative(-0.08f, -0.07f, -0.13f, -0.18f, -0.13f, -0.29f)
                curveToRelative(0f, -0.11f, 0.05f, -0.21f, 0.13f, -0.29f)
                close()
                moveTo(24f, 4.0f)
                verticalLineToRelative(1f)
                lineTo(0f, 5.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(24f)
                close()
                moveTo(0f, 19f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                lineTo(0f, 20f)
                verticalLineToRelative(-1f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                lineTo(8f, 10f)
                verticalLineToRelative(-1f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                lineTo(8f, 15f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Outdent = it}
