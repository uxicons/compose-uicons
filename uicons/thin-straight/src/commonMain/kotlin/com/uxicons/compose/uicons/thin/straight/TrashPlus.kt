package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashPlus: ImageVector? = null

val Icons.Ts.TrashPlus: ImageVector
    get() = _TrashPlus ?: UXIcon(name = "TrashPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 14.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(23f, 5f)
                horizontalLineToRelative(-1.55f)
                lineToRelative(-1.83f, 16.77f)
                curveToRelative(-0.14f, 1.27f, -1.21f, 2.23f, -2.48f, 2.23f)
                lineTo(6.83f, 24f)
                curveToRelative(-1.28f, 0f, -2.35f, -0.96f, -2.48f, -2.23f)
                lineTo(2.55f, 5f)
                horizontalLineToRelative(-1.55f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20.44f, 5f)
                lineTo(3.56f, 5f)
                lineToRelative(1.79f, 16.66f)
                curveToRelative(0.08f, 0.77f, 0.72f, 1.34f, 1.49f, 1.34f)
                horizontalLineToRelative(10.29f)
                curveToRelative(0.77f, 0f, 1.41f, -0.57f, 1.49f, -1.34f)
                lineToRelative(1.82f, -16.66f)
                close()
            }
        }.also { _TrashPlus = it}
