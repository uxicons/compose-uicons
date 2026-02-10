package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectsColumn: ImageVector? = null

val Icons.Rs.ObjectsColumn: ImageVector
    get() = _ObjectsColumn ?: UXIcon(name = "ObjectsColumn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                lineTo(11f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                close()
                moveTo(9f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(9f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(11f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 11f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                close()
                moveTo(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-13f)
                lineTo(0f, 11f)
                verticalLineToRelative(10f)
                close()
                moveTo(2f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _ObjectsColumn = it}
