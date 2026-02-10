package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCheck: ImageVector? = null

val Icons.Ts.TrashCheck: ImageVector
    get() = _TrashCheck ?: UXIcon(name = "TrashCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.55f)
                lineToRelative(1.8f, 16.77f)
                curveToRelative(0.14f, 1.27f, 1.21f, 2.23f, 2.49f, 2.23f)
                horizontalLineToRelative(10.29f)
                curveToRelative(1.28f, 0f, 2.35f, -0.96f, 2.48f, -2.23f)
                lineToRelative(1.83f, -16.77f)
                horizontalLineToRelative(1.55f)
                verticalLineToRelative(-1f)
                close()
                moveTo(8f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(18.62f, 21.66f)
                curveToRelative(-0.08f, 0.76f, -0.72f, 1.34f, -1.49f, 1.34f)
                lineTo(6.83f, 23f)
                curveToRelative(-0.77f, 0f, -1.41f, -0.58f, -1.49f, -1.34f)
                lineTo(3.56f, 5f)
                horizontalLineToRelative(16.89f)
                lineToRelative(-1.82f, 16.66f)
                close()
                moveTo(9.29f, 16.56f)
                lineToRelative(-2.42f, -2.33f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(2.43f, 2.34f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.01f)
                lineToRelative(5.49f, -5.4f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-5.49f, 5.4f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                close()
            }
        }.also { _TrashCheck = it}
