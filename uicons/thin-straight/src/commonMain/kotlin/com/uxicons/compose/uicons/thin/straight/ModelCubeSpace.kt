package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeSpace: ImageVector? = null

val Icons.Ts.ModelCubeSpace: ImageVector
    get() = _ModelCubeSpace ?: UXIcon(name = "ModelCubeSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, -0.01f)
                lineTo(1.5f, 6.0f)
                verticalLineToRelative(12.01f)
                lineToRelative(10.5f, 6.0f)
                lineToRelative(10.5f, -6.0f)
                lineTo(22.5f, 6.0f)
                lineTo(12f, -0.01f)
                close()
                moveTo(20.99f, 6.29f)
                lineToRelative(-3.49f, 2.0f)
                lineToRelative(-5.5f, -3.16f)
                lineToRelative(-5.5f, 3.16f)
                lineToRelative(-3.49f, -2.0f)
                lineTo(12f, 1.15f)
                lineToRelative(8.99f, 5.14f)
                close()
                moveTo(7f, 9.72f)
                lineToRelative(4.5f, 2.57f)
                verticalLineToRelative(5.15f)
                lineToRelative(-4.5f, -2.57f)
                verticalLineToRelative(-5.15f)
                close()
                moveTo(12.5f, 12.29f)
                lineToRelative(4.5f, -2.57f)
                verticalLineToRelative(5.15f)
                lineToRelative(-4.5f, 2.57f)
                verticalLineToRelative(-5.15f)
                close()
                moveTo(12f, 11.42f)
                lineToRelative(-4.49f, -2.57f)
                lineToRelative(4.49f, -2.58f)
                lineToRelative(4.49f, 2.58f)
                lineToRelative(-4.49f, 2.57f)
                close()
                moveTo(2.5f, 7.15f)
                lineToRelative(3.5f, 2f)
                verticalLineToRelative(6.3f)
                lineToRelative(5.5f, 3.14f)
                verticalLineToRelative(3.98f)
                lineToRelative(-9f, -5.14f)
                lineTo(2.5f, 7.15f)
                close()
                moveTo(12.5f, 22.57f)
                verticalLineToRelative(-3.98f)
                lineToRelative(5.5f, -3.14f)
                verticalLineToRelative(-6.3f)
                lineToRelative(3.5f, -2f)
                verticalLineToRelative(10.28f)
                lineToRelative(-9f, 5.14f)
                close()
            }
        }.also { _ModelCubeSpace = it}
