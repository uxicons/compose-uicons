package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Z: ImageVector? = null

val Icons.Ts.Z: ImageVector
    get() = _Z ?: UXIcon(name = "Z") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineTo(3.97f)
                curveToRelative(-0.81f, 0f, -1.51f, -0.47f, -1.82f, -1.22f)
                curveToRelative(-0.31f, -0.75f, -0.15f, -1.57f, 0.43f, -2.14f)
                lineTo(20.71f, 2.65f)
                curveToRelative(0.28f, -0.28f, 0.36f, -0.68f, 0.21f, -1.05f)
                curveToRelative(-0.15f, -0.37f, -0.49f, -0.6f, -0.89f, -0.6f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(20.03f)
                curveToRelative(0.81f, 0f, 1.51f, 0.47f, 1.82f, 1.22f)
                curveToRelative(0.31f, 0.75f, 0.15f, 1.57f, -0.43f, 2.14f)
                lineTo(3.29f, 21.35f)
                curveToRelative(-0.28f, 0.28f, -0.36f, 0.68f, -0.21f, 1.05f)
                curveToRelative(0.15f, 0.37f, 0.49f, 0.6f, 0.89f, 0.6f)
                horizontalLineTo(22f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Z = it}
