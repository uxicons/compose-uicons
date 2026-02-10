package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ballot: ImageVector? = null

val Icons.Sr.Ballot: ImageVector
    get() = _Ballot ?: UXIcon(name = "Ballot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(10f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
            }
        }.also { _Ballot = it}
