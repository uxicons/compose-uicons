package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Tr.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(16.5f, 5f)
                curveToRelative(-0.67f, 0f, -1.3f, 0.26f, -1.77f, 0.73f)
                lineToRelative(-8.42f, 8.41f)
                curveToRelative(-0.85f, 0.85f, -1.32f, 1.98f, -1.32f, 3.18f)
                verticalLineToRelative(0.67f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.67f)
                curveToRelative(1.2f, 0f, 2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(8.41f, -8.41f)
                curveToRelative(0.97f, -0.88f, 0.97f, -2.66f, 0.01f, -3.54f)
                curveToRelative(-0.47f, -0.47f, -1.1f, -0.73f, -1.77f, -0.73f)
                close()
                moveTo(9.14f, 16.98f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-0.67f)
                verticalLineToRelative(-0.67f)
                curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.03f, -2.48f)
                lineToRelative(6.31f, -6.31f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(17.56f, 8.56f)
                lineTo(16.16f, 9.96f)
                lineTo(14.04f, 7.84f)
                lineTo(15.44f, 6.44f)
                curveToRelative(0.56f, -0.58f, 1.56f, -0.58f, 2.13f, 0.01f)
                curveToRelative(0.57f, 0.52f, 0.56f, 1.59f, -0.01f, 2.11f)
                close()
            }
        }.also { _SquarePen = it}
