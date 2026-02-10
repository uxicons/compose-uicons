package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StandardDefinition: ImageVector? = null

val Icons.Bs.StandardDefinition: ImageVector
    get() = _StandardDefinition ?: UXIcon(name = "StandardDefinition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(11f, 9.75f)
                verticalLineToRelative(0.34f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineToRelative(-0.47f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                curveToRelative(0f, 0.49f, 0.47f, 0.81f, 1.48f, 1.38f)
                curveToRelative(1.05f, 0.6f, 2.5f, 1.41f, 2.5f, 3.12f)
                curveToRelative(0f, 1.52f, -1.23f, 2.75f, -2.75f, 2.75f)
                horizontalLineToRelative(-0.47f)
                curveToRelative(-1.52f, 0f, -2.75f, -1.23f, -2.75f, -2.75f)
                verticalLineToRelative(-0.34f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.47f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                curveToRelative(0f, -0.49f, -0.47f, -0.81f, -1.48f, -1.38f)
                curveToRelative(-1.05f, -0.6f, -2.5f, -1.41f, -2.5f, -3.12f)
                curveToRelative(0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                horizontalLineToRelative(0.47f)
                curveToRelative(1.52f, 0f, 2.75f, 1.23f, 2.75f, 2.75f)
                close()
            }
        }.also { _StandardDefinition = it}
