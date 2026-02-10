package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanCheck: ImageVector? = null

val Icons.Ts.TrashCanCheck: ImageVector
    get() = _TrashCanCheck ?: UXIcon(name = "TrashCanCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.4f, 16.56f)
                lineToRelative(-2.42f, -2.33f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(2.43f, 2.34f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                horizontalLineToRelative(0f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(5.49f, -5.4f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-5.48f, 5.4f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                close()
                moveTo(22f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(6.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(4f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
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
                moveTo(19f, 5f)
                lineTo(5f, 5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(19f, 5f)
                close()
            }
        }.also { _TrashCanCheck = it}
