package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchSimple: ImageVector? = null

val Icons.Sr.WrenchSimple: ImageVector
    get() = _WrenchSimple ?: UXIcon(name = "WrenchSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 1.08f)
                verticalLineTo(7.83f)
                curveToRelative(0f, 1.62f, -1.22f, 3.08f, -2.84f, 3.17f)
                curveToRelative(-1.73f, 0.09f, -3.16f, -1.28f, -3.16f, -3.0f)
                verticalLineTo(1.08f)
                curveToRelative(0f, -0.8f, -0.84f, -1.3f, -1.57f, -0.95f)
                curveTo(3.65f, 1.96f, 1f, 5.81f, 1f, 10.07f)
                curveToRelative(0f, 4.15f, 2.29f, 7.9f, 5.99f, 9.79f)
                curveToRelative(0.61f, 0.32f, 1.01f, 1.0f, 1.01f, 1.74f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -0.74f, 0.4f, -1.42f, 1.01f, -1.74f)
                curveToRelative(3.69f, -1.89f, 5.99f, -5.65f, 5.99f, -9.79f)
                curveTo(23f, 5.81f, 20.36f, 1.96f, 16.57f, 0.12f)
                curveToRelative(-0.72f, -0.35f, -1.57f, 0.15f, -1.57f, 0.95f)
                close()
            }
        }.also { _WrenchSimple = it}
