package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StandardDefinition: ImageVector? = null

val Icons.Ts.StandardDefinition: ImageVector
    get() = _StandardDefinition ?: UXIcon(name = "StandardDefinition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(16.5f, 7f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19f, 13.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 9.75f)
                curveToRelative(0f, 0.73f, 0.52f, 1.35f, 1.25f, 1.47f)
                lineToRelative(2.69f, 0.57f)
                curveToRelative(1.18f, 0.2f, 2.06f, 1.23f, 2.06f, 2.45f)
                curveToRelative(0f, 1.52f, -1.23f, 2.75f, -2.75f, 2.75f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.96f, 0f, 1.75f, -0.79f, 1.75f, -1.75f)
                curveToRelative(0f, -0.73f, -0.52f, -1.35f, -1.25f, -1.47f)
                lineToRelative(-2.69f, -0.57f)
                curveToRelative(-1.18f, -0.2f, -2.06f, -1.23f, -2.06f, -2.45f)
                curveToRelative(0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                horizontalLineToRelative(1.25f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-0.96f, 0f, -1.75f, 0.79f, -1.75f, 1.75f)
                close()
            }
        }.also { _StandardDefinition = it}
